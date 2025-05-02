package com.warrenoc.commandercore.api;

public interface Faction {
    String getName();  // Faction name
    String getDescription();  // Faction description
    String getFactionId();  // Unique ID for faction (for referencing in the system)

    // Other optional methods:
    // List of units they can offer (this would be implemented later in your system)
}
