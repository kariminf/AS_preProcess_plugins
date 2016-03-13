package kariminf.langpi.basic.swedish;

import kariminf.langpi.basic.PreProcessInfo;

public class SvInfo implements PreProcessInfo {

	@Override
	public String getISO639_1() {
		return "sv";
	}

	@Override
	public String getLangEnglishName() {
		return "Swedish";
	}

	@Override
	public String getLangName() {
		return "svenska";
	}

	@Override
	public String getPrefix() {
		return "Sv";
	}

}