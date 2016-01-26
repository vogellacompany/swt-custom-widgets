package com.vogella.customwidgets.databinding.internal;

import org.eclipse.core.databinding.observable.IDiff;
import org.eclipse.core.databinding.property.IProperty;
import org.eclipse.core.databinding.property.ISimplePropertyListener;
import org.eclipse.core.databinding.property.NativePropertyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

import com.vogella.customwidgets.core.checkbox.Checkbox;

public class CheckboxSelectionListener extends NativePropertyListener<Checkbox, IDiff> implements SelectionListener {

	public CheckboxSelectionListener(IProperty property, ISimplePropertyListener<Checkbox, IDiff> listener) {
		super(property, listener);
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		fireChange((Checkbox) e.widget, null);
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
	}

	@Override
	protected void doAddTo(Checkbox source) {
		source.addSelectionListener(this);
	}

	@Override
	protected void doRemoveFrom(Checkbox source) {
		source.removeSelectionListener(this);
	}

}
