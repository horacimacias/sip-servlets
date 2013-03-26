/*
 * TeleStax, Open Source Cloud Communications  Copyright 2012. 
 * and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.mobicents.metadata.sip.parser;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.jboss.metadata.parser.util.MetaDataElementParser;
import org.mobicents.metadata.sip.spec.Attribute;
import org.mobicents.metadata.sip.spec.Element;
import org.mobicents.metadata.sip.spec.IdentityAssertionMetaData;

/**
 * @author josemrecio@gmail.com
 */
public class IdentityAssertionParser extends MetaDataElementParser {

    public static IdentityAssertionMetaData parse(XMLStreamReader reader) throws XMLStreamException {
<<<<<<< HEAD
        IdentityAssertionMetaData idAssertionConfig = new IdentityAssertionMetaData();
=======
    	IdentityAssertionMetaData idAssertionConfig = new IdentityAssertionMetaData();
>>>>>>> 567e843... Initial commit for Issue 203: 	Upgrade to jboss-as-7.2.0.Final

        // Handle attributes
        final int count = reader.getAttributeCount();
        for (int i = 0; i < count; i++) {
            final String value = reader.getAttributeValue(i);
            if (attributeHasNamespace(reader, i)) {
                continue;
            }
            final Attribute attribute = Attribute.forName(reader.getAttributeLocalName(i));
            switch (attribute) {
                case ID: {
<<<<<<< HEAD
                    idAssertionConfig.setId(value);
=======
                	idAssertionConfig.setId(value);
>>>>>>> 567e843... Initial commit for Issue 203: 	Upgrade to jboss-as-7.2.0.Final
                    break;
                }
                default:
                    throw unexpectedAttribute(reader, i);
            }
        }

        // Handle elements
        while (reader.hasNext() && reader.nextTag() != END_ELEMENT) {
            final Element element = Element.forName(reader.getLocalName());
            switch (element) {
                case IDENTITY_ASSERTION_SCHEME:
<<<<<<< HEAD
                    idAssertionConfig.setIdentityAssertionScheme(getElementText(reader));
                    break;
                case IDENTITY_ASSERTION_SUPPORT:
                    idAssertionConfig.setIdentityAssertionSupport(getElementText(reader));
                    break;
=======
                	idAssertionConfig.setIdentityAssertionScheme(getElementText(reader));
                    break;
                case IDENTITY_ASSERTION_SUPPORT:
                	idAssertionConfig.setIdentityAssertionSupport(getElementText(reader));
                	break;
>>>>>>> 567e843... Initial commit for Issue 203: 	Upgrade to jboss-as-7.2.0.Final
                default:
                    throw unexpectedElement(reader);
            }
        }

        return idAssertionConfig;
    }

}
