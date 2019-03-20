/*******************************************************************************
 * Copyright (c) 2012 VMWare, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     VMWare, Inc. - initial API and implementation
 *******************************************************************************/
package org.grails.ide.eclipse.junit;

import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.jdt.internal.junit.launcher.JUnitTabGroup;

/**
 * @author Kris De Volder
 */
@SuppressWarnings("restriction")
public class GrailsJUnitTabGroup extends JUnitTabGroup {

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		super.createTabs(dialog, mode);
	}

}
