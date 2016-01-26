package com.vogella.customwidgets.css;

import org.eclipse.e4.ui.css.core.dom.properties.converters.ICSSValueConverter;
import org.eclipse.e4.ui.css.core.engine.CSSEngine;
import org.eclipse.e4.ui.css.swt.dom.CompositeElement;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.w3c.dom.css.CSSValue;

import com.vogella.customwidgets.core.checkbox.Checkbox;

public class CheckColorElementAdapter extends CompositeElement {

	public CheckColorElementAdapter(Composite composite, CSSEngine engine) {
		super(composite, engine);
	}
}
