package com.home.homeproject.cache;

import java.lang.ref.SoftReference;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.hibernate.resource.transaction.backend.jta.internal.synchronization.SynchronizationCallbackCoordinatorNonTrackingImpl;

public class InMemoryCache implements Cache {

	private static final int CLEAN_UP_PERIOD_IN_SEC = 5;
	
	private final ConcurrentHashMap<String, SoftReference<CacheObject>> cache = new ConcurrentHashMap<>();
	
	public  InMemoryCache() {
		Thread demonCleanerThread  = new Thread(
		 ()->{
			 while(!Thread.currentThread().isInterrupted()) {
				 
				 try {
					Thread.sleep(CLEAN_UP_PERIOD_IN_SEC*10000);	
					System.out.println("before ---)"+cache.size());
					cache.entrySet().removeIf(entry->  Optional.ofNullable(entry.getValue()).map(SoftReference::get).map(CacheObject::isExpired).orElse(false));
					System.out.println("after ---)"+cache.size());
				} catch (Exception e) {
					Thread.currentThread().interrupt();
				}
				 
			 }
			 
			 
		 }
				
		);
		demonCleanerThread.setDaemon(true);
		demonCleanerThread.start();
		
	}
	
	@Override
	public void add(String key, Object value, long periodInMillis) {
		 if(key==null) {
			return ; 
		 }
		 if(value==null) {
			 cache.remove(key);
		 }else {
			 long expriyTime = System.currentTimeMillis()+periodInMillis;
			 System.out.println("InMemoryCache.add()"+expriyTime);
			 cache.put(key, new SoftReference<>(new CacheObject(value,expriyTime)));
			 
		 }
		 
			 
		

	}

	@Override
	public Object get(String key) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(cache.get(key)).map(SoftReference::get).filter(ob->!ob.isExpired()).map(CacheObject::getValue).orElse(null);
		 
	}

	@Override
	public void remove(String key) {
		cache.remove(key);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		cache.clear();

	}

	@Override
	public long size() {
		// TODO Auto-generated method stub
		return	cache.entrySet().stream().filter(entry->Optional.ofNullable(entry.getValue()).map(SoftReference::get).map(o->!o.isExpired()).orElse(false)).count();
		 
	}
	
	
	private static class CacheObject {
		
		
		private Object value;
        private long expiryTime;
        
        private boolean  expired;
        
        public CacheObject(Object value, long expiryTime) {
			this.expiryTime = expiryTime;
			this.value = value;
		}
        
        boolean isExpired() {
        	this.expired =System.currentTimeMillis() > expiryTime;
        	return System.currentTimeMillis() > expiryTime;
        	
        }

		public Object getValue() {
			return value;
		}

		public void setValue(Object value) {
			this.value = value;
		}

		public long getExpiryTime() {
			return expiryTime;
		}

		public void setExpiryTime(long expiryTime) {
			this.expiryTime = expiryTime;
		}

		@Override
		public String toString() {
			return "CacheObject [value=" + value + ", expiryTime=" + expiryTime + ", expired=" + expired + "]";
		}
        
		
	}


	@Override
	public void print() {
		System.out.println("InMemoryCache.print() -------"+cache.size());
		List<CacheObject> cacheObjects = cache.entrySet().stream().map(entry->entry.getValue().get()).collect(Collectors.toList());
		cacheObjects.forEach(o->System.out.println(o));
		
	}

}
