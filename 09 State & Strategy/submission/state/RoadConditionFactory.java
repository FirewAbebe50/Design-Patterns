package cs525.labs.state;

/**
 * Factory to create roadCondition instance
 * @author OWNER
 *
 */
public interface RoadConditionFactory {

	RoadCondition getCondition(String type);
}
