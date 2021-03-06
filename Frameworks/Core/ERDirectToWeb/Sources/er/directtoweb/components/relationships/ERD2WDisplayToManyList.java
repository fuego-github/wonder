/*
 * Copyright (C) NetStruxr, Inc. All rights reserved.
 *
 * This software is published under the terms of the NetStruxr
 * Public Software License version 0.5, a copy of which has been
 * included with this distribution in the LICENSE.NPL file.  */
package er.directtoweb.components.relationships;

import com.webobjects.appserver.WOContext;
import com.webobjects.directtoweb.D2WDisplayToManyTable;

/**
 * Improved toMany display compononent, uses ERListDisplay.<br />
 * @d2wKey emptyArrayDisplayString
 */
public class ERD2WDisplayToManyList extends D2WDisplayToManyTable {

    public ERD2WDisplayToManyList(WOContext context) { super(context); }
}
