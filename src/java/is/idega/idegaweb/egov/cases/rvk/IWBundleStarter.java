/*
 * $Id: IWBundleStarter.java,v 1.1 2008/04/01 14:53:09 palli Exp $
 * Created on Oct 30, 2005
 *
 * Copyright (C) 2005 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package is.idega.idegaweb.egov.cases.rvk;

import com.idega.idegaweb.IWBundle;
import com.idega.idegaweb.IWBundleStartable;


public class IWBundleStarter implements IWBundleStartable {

	public void start(IWBundle starterBundle) {
		//GlobalIncludeManager.getInstance().addBundleStyleSheet(CaseConstants.IW_BUNDLE_IDENTIFIER, "/style/case.css");
		//CaseCodeManager.getInstance().addCaseBusinessForCode(CaseConstants.CASE_CODE_KEY, CasesBusiness.class);
		//registerCaseChangeListener(starterBundle);
	}

	public void stop(IWBundle starterBundle) {
	}
	
	/*private void registerCaseChangeListener(IWBundle starterBundle) {
	}*/
}