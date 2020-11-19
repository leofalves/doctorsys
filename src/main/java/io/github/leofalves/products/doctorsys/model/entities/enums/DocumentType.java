package io.github.leofalves.products.doctorsys.model.entities.enums;

public enum DocumentType {

	RG(1), CPF(2);

	private int code;

	DocumentType(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static DocumentType valueOf(int code) {
		for (DocumentType value : DocumentType.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid DocumentType Code");
	}

}
