package org.acme.ecomon.model;

import java.time.ZonedDateTime;

public record EnergyPriceOfHour(
		ZonedDateTime from,
		ZonedDateTime to,
		EnergyPriceSpecification priceSpecification
) {
}
