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
package org.eclipse.jdt.debug.testplugin;

import org.eclipse.debug.core.DebugException;
import org.eclipse.jdt.core.dom.Message;
import org.eclipse.jdt.debug.core.IJavaBreakpoint;
import org.eclipse.jdt.debug.core.IJavaBreakpointListener;
import org.eclipse.jdt.debug.core.IJavaDebugTarget;
import org.eclipse.jdt.debug.core.IJavaLineBreakpoint;
import org.eclipse.jdt.debug.core.IJavaThread;
import org.eclipse.jdt.debug.core.IJavaType;

/**
 * @author Andrew Eisenberg
 */
public class ResumeBreakpointListener implements IJavaBreakpointListener {
	
	public static boolean WAS_HIT = false; 

	public ResumeBreakpointListener() {
	}

	public void addingBreakpoint(IJavaDebugTarget target, IJavaBreakpoint breakpoint) {
	}

	public void breakpointHasCompilationErrors(IJavaLineBreakpoint breakpoint, Message[] errors) {
	}

	public void breakpointHasRuntimeException(IJavaLineBreakpoint breakpoint, DebugException exception) {
	}

	public int breakpointHit(IJavaThread thread, IJavaBreakpoint breakpoint) {
		WAS_HIT = true;
		return IJavaBreakpointListener.DONT_SUSPEND;
	}

	public void breakpointInstalled(IJavaDebugTarget target, IJavaBreakpoint breakpoint) {
	}

	public void breakpointRemoved(IJavaDebugTarget target, IJavaBreakpoint breakpoint) {
	}

	public int installingBreakpoint(IJavaDebugTarget target, IJavaBreakpoint breakpoint, IJavaType type) {
		return IJavaBreakpointListener.DONT_CARE;
	}

}
