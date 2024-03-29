package org.acme.ecomon.model;

import java.util.Currency;

public record EnergyPriceSpecification(
		Float price,
		Currency priceCurrency
) {
}
