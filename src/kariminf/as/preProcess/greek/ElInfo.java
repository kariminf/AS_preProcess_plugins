package kariminf.as.preProcess.greek;

import dz.aak.as.preProcess.lang.PreProcessInfo;

public class ElInfo implements PreProcessInfo {

	@Override
	public String getISO639_1() {
		return "el";
	}

	@Override
	public String getLangEnglishName() {
		return "Greek";
	}

	@Override
	public String getLangName() {
		return "ελληνικά";
	}

	@Override
	public String getPrefix() {
		return "El";
	}

}