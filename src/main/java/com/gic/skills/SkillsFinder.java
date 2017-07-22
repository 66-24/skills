package com.gic.skills;

import net.amygdalum.stringsearchalgorithms.search.StringFinder;
import net.amygdalum.stringsearchalgorithms.search.StringMatch;
import net.amygdalum.stringsearchalgorithms.search.chars.SetHorspool;
import net.amygdalum.stringsearchalgorithms.search.chars.StringSearchAlgorithm;
import net.amygdalum.util.io.CharProvider;
import net.amygdalum.util.io.StringCharProvider;

import javax.annotation.Nonnull;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Find _all_ skills in a dictionary contained in a blob of text
 * Not tested against scale
 */
public class SkillsFinder {

    List<ProgrammingSkill> inTextBlob(@Nonnull final Collection<String> patterns, @Nonnull final String skillsBlob) {
        Objects.requireNonNull(patterns);
        Objects.requireNonNull(skillsBlob);

        SetHorspool.Factory factory = new SetHorspool.Factory(false);
        StringSearchAlgorithm searchAlgorithm = factory.of(patterns);
        CharProvider text = new StringCharProvider(skillsBlob.toLowerCase(), 0);
        StringFinder finder = searchAlgorithm.createFinder(text);
        return finder.findAll()
                .stream()
                .map(stringMatch -> ProgrammingSkill.builder().name(stringMatch.text()).build())
                .collect(Collectors.toList());


    }
}