package es.sm2baleares.tinglao.service.impl;

import es.sm2baleares.tinglao.service.DeliveryScoreService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by pablo.beltran on 21/09/2016.
 */
@Service
@Qualifier("DeliveryScoreService")
public class DeliveryScoreServiceImpl implements DeliveryScoreService {

	private long totalPoints;

	public void submitDeliveryPoints(long points) {
		totalPoints += points;
	}

	public long getCurrentScore() {
		return totalPoints;
	}
}