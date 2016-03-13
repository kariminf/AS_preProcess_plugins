package kariminf.langpi.basic.indonesian;

import kariminf.langpi.basic.PreProcessInfo;

public class IdInfo implements PreProcessInfo {

	@Override
	public String getISO639_1() {
		return "id";
	}

	@Override
	public String getLangEnglishName() {
		return "Indonesian";
	}

	@Override
	public String getLangName() {
		return "Bahasa Indonesia";
	}

	@Override
	public String getPrefix() {
		return "Id";
	}

}