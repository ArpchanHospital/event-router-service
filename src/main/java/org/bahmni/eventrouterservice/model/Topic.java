package org.bahmni.eventrouterservice.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@NoArgsConstructor
@AllArgsConstructor
public class Topic {
    private String name;
    private String subscriptionId;

    public String getName() { return name; }
    public String getSubscriptionId() { return subscriptionId; }
}
