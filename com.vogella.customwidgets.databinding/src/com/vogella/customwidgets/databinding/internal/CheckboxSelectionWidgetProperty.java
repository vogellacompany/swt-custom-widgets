package com.vogella.customwidgets.databinding.internal;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.masterdetail.IObservableFactory;
import org.eclipse.core.databinding.property.INativePropertyListener;
import org.eclipse.core.databinding.property.ISimplePropertyListener;
import org.eclipse.jface.databinding.swt.WidgetValueProperty;

import com.vogella.customwidgets.core.checkbox.Checkbox;

public class CheckboxSelectionWidgetProperty extends WidgetValueProperty {

	@Override
	public Object getValueType() {
		return Boolean.class;
	}

	@Override
	protected Object doGetValue(Object source) {
		if(source instanceof Checkbox) {
			return ((Checkbox) source).getSelection();
		}
		
		return null;
	}

	@Override
	protected void doSetValue(Object source, Object value) {
		if(source instanceof Checkbox && value instanceof Boolean) {
			Boolean selection = (Boolean) value;
			((Checkbox) source).setSelection(selection.booleanValue());
		}
	}
	
	@Override
	public INativePropertyListener adaptListener(ISimplePropertyListener listener) {
		return new CheckboxSelectionListener(this, listener);
	}
}
