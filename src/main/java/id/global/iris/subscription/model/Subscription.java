package id.global.iris.subscription.model;

public record Subscription(String resourceType, String resourceId, String sessionId) {

    public String id() {
        return resourceType + "-" + resourceId;
    }

}
