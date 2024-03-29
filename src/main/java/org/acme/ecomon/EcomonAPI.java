package org.acme.ecomon;

import io.smallrye.graphql.client.typesafe.api.GraphQLClientApi;
import org.acme.ecomon.model.EnergyBiddingZone;
import org.acme.ecomon.model.EnergyPriceOfHour;
import org.eclipse.microprofile.graphql.*;

import java.time.ZonedDateTime;
import java.util.List;

@GraphQLClientApi(configKey = "ecomon")
public interface EcomonAPI {

	// Spot prices
	@Query
	EnergyPriceOfHour dayAheadPrices(
			@NonNull @Name("from") String from,
			@NonNull @Name("to") String to,
			@NonNull @Name("zone") EnergyBiddingZone priceZone
	);

}
