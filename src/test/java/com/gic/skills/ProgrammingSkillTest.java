package com.gic.skills;

import io.atlassian.fugue.Option;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProgrammingSkillTest {

    @Test
    public void should_build_valid_object() {

        ProgrammingSkill hadoop = ProgrammingSkill.of("hadoop", Option.none(), Option.none());
        assertNotNull(hadoop.category());
        assertFalse(hadoop.category().isDefined());

        ProgrammingSkill spark = ProgrammingSkill.builder().name("spark").build();
        assertNotNull(spark.name());
        assertEquals(Option.none(),spark.category());


    }


}