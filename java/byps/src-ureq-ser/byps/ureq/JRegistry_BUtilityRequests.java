package byps.ureq;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRegistry DO NOT MODIFY.
 */

import byps.*;

public class JRegistry_BUtilityRequests extends BRegistry { 

	public JRegistry_BUtilityRequests() {
		super(BBinaryModel.JSON);
	}
	
	private static BRegisteredSerializer[] serializers = new BRegisteredSerializer[] {
		new BRegisteredSerializer(60626368, "byps.ureq.JSerializer_60626368"),
		new BRegisteredSerializer(174367442, "byps.ureq.JSerializer_174367442"),
		new BRegisteredSerializer(421787891, "byps.ureq.JSerializer_421787891"),
		new BRegisteredSerializer(1710660846, "byps.ureq.JSerializer_1710660846"),
		new BRegisteredSerializer(1828952285, "byps.ureq.JSerializer_1828952285"),
		new BRegisteredSerializer(1845498599, "byps.ureq.JSerializer_1845498599"),
		new BRegisteredSerializer(2048473051, "byps.ureq.JSerializer_2048473051"),
	};
	@Override
	protected BRegisteredSerializer[] getSortedSerializers() {
		return serializers;
	}
}
