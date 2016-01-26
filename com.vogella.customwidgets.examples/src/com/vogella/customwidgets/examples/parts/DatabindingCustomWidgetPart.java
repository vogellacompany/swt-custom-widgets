package com.vogella.customwidgets.examples.parts;

import javax.annotation.PostConstruct;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import com.vogella.customwidgets.core.checkbox.Checkbox;
import com.vogella.customwidgets.databinding.CustomWidgetProperties;

public class DatabindingCustomWidgetPart {

	@PostConstruct
	public void createComposite(Composite parent) {
		GridLayoutFactory.fillDefaults().applyTo(parent);
		Checkbox checkbox = new Checkbox(parent, SWT.NONE);
		checkbox.setSelection(true);
		
		Label label = new Label(parent, SWT.NONE);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(label);
		
		DataBindingContext dbc = new DataBindingContext();
		
		IObservableValue checkboxProperty = CustomWidgetProperties.selection().observe(checkbox);
		ISWTObservableValue labelProperty = WidgetProperties.text().observe(label);
		
		dbc.bindValue(labelProperty, checkboxProperty);
	}
}
