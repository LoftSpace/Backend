package Trabook.PlanManager.service.planList;

import Trabook.PlanManager.domain.plan.Plan;
import Trabook.PlanManager.domain.plan.PlanListResponseDTO;
import Trabook.PlanManager.repository.plan.PlanListRepository;
import Trabook.PlanManager.repository.plan.PlanRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetUserScrapPlanList implements PlanListServiceInterface{

    private final PlanListRepository planListRepository;

    public GetUserScrapPlanList(PlanListRepository planListRepository) {
        this.planListRepository = planListRepository;
    }
    @Override
    public List<PlanListResponseDTO> getPlanList(long userId) {
        return planListRepository.findUserScrappedPlanList(userId);
    }

    @Override
    public boolean isAvailableService() {
        return false;
    }
}
