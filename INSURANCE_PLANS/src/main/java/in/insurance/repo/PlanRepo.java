package in.insurance.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.insurance.entity.Plan;

public interface PlanRepo extends JpaRepository<Plan, Integer> {

}
