package com.vogella.customwidgets.databinding.internal;

import org.eclipse.core.databinding.property.value.DelegatingValueProperty;
import org.eclipse.core.databinding.property.value.IValueProperty;

import com.vogella.customwidgets.core.checkbox.Checkbox;

public class SelectionWidgetProperty extends DelegatingValueProperty<Object, Object> {

	@Override
	protected IValueProperty<Object, Object> doGetDelegate(Object source) {

		if (source instanceof Checkbox) {
			return new CheckboxSelectionWidgetProperty();
		}

		return null;
	}
}
