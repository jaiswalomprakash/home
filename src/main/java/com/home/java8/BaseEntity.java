package com.home.java8;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

// TODO: Auto-generated Javadoc
/**
 * The Class BaseEntity.
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The active. */
	private byte active;

	/** The created by user id. */
	@Column(name = "created_by")
	private Integer createdBy;

	/** The created date. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created")
	private Date created;

	/** The modified by user id. */
	@Column(name = "modified_by")
	private Integer modifiedBy;

	/** The modified date. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modified")
	private Date modified;
	
	/** The deleted by user id. */
	@Column(name = "deleted_by")
	private Integer deletedBy;

	/** The deleted date. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "deleted")
	private Date deleted;


	/**
	 * Gets the active.
	 *
	 * @return the active
	 */
	public byte getActive() {
		return this.active;
	}

	/**
	 * Sets the active.
	 *
	 * @param active the new active
	 */
	public void setActive(byte active) {
		this.active = active;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Integer getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Integer modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Integer getDeletedBy() {
		return deletedBy;
	}

	public void setDeletedBy(Integer deletedBy) {
		this.deletedBy = deletedBy;
	}

	public Date getDeleted() {
		return deleted;
	}

	public void setDeleted(Date deleted) {
		this.deleted = deleted;
	}

	

}