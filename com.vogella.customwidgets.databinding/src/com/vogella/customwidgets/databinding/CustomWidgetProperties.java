package com.vogella.customwidgets.databinding;

import org.eclipse.core.databinding.property.value.IValueProperty;

import com.vogella.customwidgets.databinding.internal.SelectionWidgetProperty;

public class CustomWidgetProperties {

	private CustomWidgetProperties() {
	}

	public static IValueProperty selection() {
		return new SelectionWidgetProperty();
	}
}
