package edu.iris.dmc.station.mapper;

import edu.iris.dmc.IrisUtil;
import edu.iris.dmc.fdsn.station.model.Distance;
import edu.iris.dmc.fdsn.station.model.ObjectFactory;
import edu.iris.dmc.fdsn.station.model.Site;
import edu.iris.dmc.fdsn.station.model.Station;
import edu.iris.dmc.seed.BTime;
import edu.iris.dmc.seed.control.station.B050;

public class StationMapper {
	private static ObjectFactory factory = new ObjectFactory();

	public static Station map(B050 blockette) throws Exception {

		String code = blockette.getStationCode().trim();

		Station station = new Station();
		station.setCode(code);

		BTime bTime = blockette.getStartTime();

		if (bTime != null) {
			station.setCreationDate(IrisUtil.toZonedDateTime(bTime));
			station.setStartDate(IrisUtil.toZonedDateTime(bTime));
		}

		bTime = blockette.getEndTime();
		if (bTime != null) {
			station.setEndDate(IrisUtil.toZonedDateTime(bTime));
		}

		station.setLatitude(LatitudeMapper.build(blockette.getLatitude()));
		station.setLongitude(LongitudeMapper.build(blockette.getLongitude()));

		Distance elevation = factory.createDistanceType();
		elevation.setValue(blockette.getElevation());

		station.setElevation(elevation);

		Site site = factory.createSiteType();

		site.setName(blockette.getSiteName());
		station.setSite(site);
		return station;

	}
}
