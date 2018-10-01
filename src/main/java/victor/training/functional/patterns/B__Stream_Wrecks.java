package victor.training.functional.patterns;
//https://dzone.com/articles/functional-programming-patterns-with-java-8
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.toList;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;

// get the products frequently ordered during the past year



class ProductService {
	// 1 approach not to suggest
	
	public List<Product> getFrequentOrderedProducts1(List<Order> orders) {
        return orders.stream()
                        .filter(o -> o.getCreationDate().isAfter(LocalDate.now().minusYears(1)))
                        .flatMap(o -> o.getOrderLines().stream())
                        .collect(groupingBy(OrderLine::getProduct, summingInt(OrderLine::getItemCount)))
                        .entrySet()
                        .stream()
                        .filter(e -> e.getValue() >= 10)
                        .map(Entry::getKey)
                        .filter(p -> !p.isDeleted())
                        .filter(p -> !productRepo.getHiddenProductIds().contains(p.getId()))
                        .collect(toList());
  }
	
	// 2 second approach
	

			public List<Product> getFrequentOrderedProducts2(List<Order> orders) {
			        List<Long> hiddenProductIds = productRepo.getHiddenProductIds();
			        Predicate<Product> productIsNotHidden = p -> !hiddenProductIds.contains(p.getId());
			        return getProductCountsOverTheLastYear(orders).entrySet().stream()
			                        .filter(e -> e.getValue() >= 10)
			                        .map(Entry::getKey)
			                        .filter(Product::isNotDeleted)
			                        .filter(productIsNotHidden)
			                        .collect(toList());
			}
	
	// final approach
	
	private ProductRepo productRepo;

	public List<Product> getFrequentOrderedProducts(List<Order> orders) {
		List<Long> hiddenProductIds = productRepo.getHiddenProductIds();
		Predicate<Product> productIsNotHidden = p -> !hiddenProductIds.contains(p.getId());
		Stream<Product> frequentProducts = getProductCountsOverTheLastYear(orders).entrySet().stream()
				.filter(e -> e.getValue() >= 10)
				.map(Entry::getKey);
		return frequentProducts
				.filter(Product::isNotDeleted)
				.filter(productIsNotHidden)
				.collect(toList());
	}

	private Map<Product, Integer> getProductCountsOverTheLastYear(List<Order> orders) {
		Predicate<Order> inThePreviousYear = o -> o.getCreationDate().isAfter(LocalDate.now().minusYears(1));
		return orders.stream()
				.filter(inThePreviousYear)
				.flatMap(o -> o.getOrderLines().stream())
				.collect(groupingBy(OrderLine::getProduct, summingInt(OrderLine::getItemCount)));
	}
}





//VVVVVVVVV ==== supporting (dummy) code ==== VVVVVVVVV
@Data
class Product {
	private Long id;
	private boolean deleted;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public boolean isDeleted() {
		return deleted;
	}


	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}


	public boolean isNotDeleted() {
		return !deleted;
	}
}

@Data
@AllArgsConstructor
class Order {
	private Long id;
	private List<OrderLine> orderLines;
	private LocalDate creationDate;
	public Order(long l, List<OrderLine> emptyList, LocalDate of) {
		id= l;
		orderLines =emptyList;
		creationDate =of;
		
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<OrderLine> getOrderLines() {
		return orderLines;
	}
	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	
}

@Data
class OrderLine {
	private Product product;
	private int itemCount;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	
}

interface ProductRepo {
	List<Long> getHiddenProductIds();
}
