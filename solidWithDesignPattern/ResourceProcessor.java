package solidWithDesignPattern;

import java.util.Map;

public class ResourceProcessor {
    private final Map<String, ResourceBorrower> resourceTypes;

    public ResourceProcessor(Map<String, ResourceBorrower> resourceType) {
        this.resourceTypes = resourceType;
    }

    public void borrowResource(Student student, Resource resource) {
        ResourceBorrower resourceBorrower = resourceTypes.get(resource.getResourceType());

        if (!resourceTypes.containsKey(resource.getResourceType())) {
            throw new IllegalArgumentException("Invalid resource type: " + resource.getResourceType());
        }

        resourceBorrower.borrowResource(student, resource);
    }

}
