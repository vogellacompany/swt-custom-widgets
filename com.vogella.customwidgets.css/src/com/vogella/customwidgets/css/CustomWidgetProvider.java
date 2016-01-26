package com.vogella.customwidgets.css;
import org.eclipse.e4.ui.css.core.dom.IElementProvider;
import org.eclipse.e4.ui.css.core.engine.CSSEngine;
import org.w3c.dom.Element;

import com.vogella.customwidgets.core.checkbox.Checkbox;

public class CustomWidgetProvider implements IElementProvider {

	@Override
	public Element getElement(Object element, CSSEngine engine) {
		if (element instanceof Checkbox) {
			return new CheckColorElementAdapter((Checkbox) element, engine);
		}
		return null;
	}
}
