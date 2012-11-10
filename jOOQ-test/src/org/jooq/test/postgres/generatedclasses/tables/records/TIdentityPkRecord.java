/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "t_identity_pk", schema = "public")
public class TIdentityPkRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityPkRecord> implements org.jooq.Record2<java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 31731974;

	/**
	 * Setter for <code>public.t_identity_pk.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK.ID, value);
	}

	/**
	 * Getter for <code>public.t_identity_pk.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 32)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK.ID);
	}

	/**
	 * Setter for <code>public.t_identity_pk.val</code>. 
	 */
	public void setVal(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK.VAL, value);
	}

	/**
	 * Getter for <code>public.t_identity_pk.val</code>. 
	 */
	@javax.persistence.Column(name = "val", precision = 32)
	public java.lang.Integer getVal() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK.VAL);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.postgres.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.postgres.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK.VAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getVal();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TIdentityPkRecord
	 */
	public TIdentityPkRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK);
	}
}
