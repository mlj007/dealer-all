package com.chexun.dealer.model.car;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CarModel  implements Serializable{

	private static final long serialVersionUID = 1L;
	private List<DealersCar> dealersCar;

	public CarModel(List<DealersCar> dealersCar) {
		super();
		this.dealersCar = dealersCar;
	}
	public CarModel() {
		super();
	}
}
