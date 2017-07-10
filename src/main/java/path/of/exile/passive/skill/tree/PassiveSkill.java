package path.of.exile.passive.skill.tree;

import path.of.exile.attribute.Attribute;
import path.of.exile.attribute.Effect;
import path.of.exile.attribute.Operator;
import path.of.exile.attribute.Value;

import java.util.ArrayList;
import java.util.List;

public class PassiveSkill {

    public static Builder builder() {
        return new Builder();
    }

    private final String guid;
    private final String name;
    private final List<Effect> effects;
    private final List<PassiveSkill> linkedSkills;

    public PassiveSkill(
            final String guid,
            final String name,
            final List<Effect> effects,
            final List<PassiveSkill> linkedSkills) {
        this.guid = guid;
        this.name = name;
        this.effects = effects;
        this.linkedSkills = linkedSkills;
    }

    public static class Builder {

        private String guid;
        private String name;
        private List<Effect> effects;
        private List<PassiveSkill> linkedSkills;

        public Builder() {
            this.effects = new ArrayList<>();
            this.linkedSkills = new ArrayList<>();
        }

        public Builder setGuid(String guid) {
            this.guid = guid;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder effect(final Operator operator, final Value value, final Attribute attribute) {
            this.effects.add(Effect.effect(operator, value, attribute));
            return this;
        }

        public Builder link(final PassiveSkill passiveSkill) {
            this.linkedSkills.add(passiveSkill);
            return this;
        }

        public PassiveSkill build() {
            return new PassiveSkill(guid, name, effects, linkedSkills);
        }
    }

}
