/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.mysql.information_schema.tables;


import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.meta.mysql.information_schema.InformationSchema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CheckConstraints extends TableImpl<Record> {

    private static final long serialVersionUID = 1630642113;

    /**
     * The reference instance of <code>information_schema.CHECK_CONSTRAINTS</code>
     */
    public static final CheckConstraints CHECK_CONSTRAINTS = new CheckConstraints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.CHECK_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    public static final TableField<Record, String> CONSTRAINT_CATALOG = createField(DSL.name("CONSTRAINT_CATALOG"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), CHECK_CONSTRAINTS, "");

    /**
     * The column <code>information_schema.CHECK_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    public static final TableField<Record, String> CONSTRAINT_SCHEMA = createField(DSL.name("CONSTRAINT_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), CHECK_CONSTRAINTS, "");

    /**
     * The column <code>information_schema.CHECK_CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    public static final TableField<Record, String> CONSTRAINT_NAME = createField(DSL.name("CONSTRAINT_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), CHECK_CONSTRAINTS, "");

    /**
     * The column <code>information_schema.CHECK_CONSTRAINTS.CHECK_CLAUSE</code>.
     */
    public static final TableField<Record, String> CHECK_CLAUSE = createField(DSL.name("CHECK_CLAUSE"), org.jooq.impl.SQLDataType.CLOB.nullable(false), CHECK_CONSTRAINTS, "");

    /**
     * No further instances allowed
     */
    private CheckConstraints() {
        this(DSL.name("CHECK_CONSTRAINTS"), null);
    }

    private CheckConstraints(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private CheckConstraints(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> CheckConstraints(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, CHECK_CONSTRAINTS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }
}
