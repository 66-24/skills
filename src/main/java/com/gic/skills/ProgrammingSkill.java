package com.gic.skills;

import io.atlassian.fugue.Option;
import org.immutables.value.Value;

import javax.annotation.Nonnull;

@Value.Immutable
@Value.Style(
        typeImmutable = "*",
        typeAbstract = "Immutable*",
        strictBuilder = true
)
abstract class  ImmutableProgrammingSkill {
    @Value.Parameter
    abstract String name();

    @Value.Parameter
    abstract Option<String> category();

    @Value.Parameter
    abstract Option<String> subCategory();

}
