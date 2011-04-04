/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2002-2008, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package org.geotools.jdbc;


/**
 * Represents a column of a primary key which has an associated sequence
 * used to generate its values.
 * <p>
 * New values for the key are generated by selecting the next value of the 
 * sequence.
 * </p>
 * @author Justin Deoliveira, OpenGEO
 *
 *
 * @source $URL$
 */
public class SequencedPrimaryKeyColumn extends PrimaryKeyColumn {

    String sequenceName;
    
    public SequencedPrimaryKeyColumn(String name, Class type, String sequenceName) {
        super(name, type);
        this.sequenceName = sequenceName;
    }

    public String getSequenceName() {
        return sequenceName;
    }
    
//    @Override
//    public Object generate(Connection cx, SQLDialect dialect)
//            throws SQLException, IOException {
//        return dialect.getNextValueFromSequence( sequence, cx );
//    }

}
