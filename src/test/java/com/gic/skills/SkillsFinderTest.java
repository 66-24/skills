package com.gic.skills;


import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import io.atlassian.fugue.Option;
import net.amygdalum.stringsearchalgorithms.search.StringMatch;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class SkillsFinderTest {

    private final SkillsFinder skillsFinder = new SkillsFinder();

    @Test
    public void should_return_all_skills_in_dictionary() {

        HashSet<String> skills = new HashSet<String>();
        skills.add("spark");
        skills.add("hadoop");
        skills.add("sqoop");
        skills.add("impala");
        skills.add("pig");
        skills.add("hive");
        skills.add("oozie");
        List<String> largeSkills = Lists.newArrayList(Splitter.on('\n')
                .omitEmptyStrings()
                .split("4th Dimension/4D\n" +
                        "ABAP\n" +
                        "ABC\n" +
                        "ActionScript\n" +
                        "Ada\n" +
                        "Agilent VEE\n" +
                        "Algol\n" +
                        "Alice\n" +
                        "Angelscript\n" +
                        "Apex\n" +
                        "APL\n" +
                        "AppleScript\n" +
                        "Arc\n" +
                        "Arduino\n" +
                        "ASP\n" +
                        "AspectJ\n" +
                        "Assembly\n" +
                        "ATLAS\n" +
                        "Augeas\n" +
                        "AutoHotkey\n" +
                        "AutoIt\n" +
                        "AutoLISP\n" +
                        "Automator\n" +
                        "Avenue\n" +
                        "Awk\n" +
                        "Bash\n" +
                        "(Visual) Basic\n" +
                        "bc\n" +
                        "BCPL\n" +
                        "BETA\n" +
                        "BlitzMax\n" +
                        "Boo\n" +
                        "Bourne Shell\n" +
                        "Bro\n" +
                        "C\n" +
                        "C Shell\n" +
                        "C#\n" +
                        "C++\n" +
                        "C++/CLI\n" +
                        "C-Omega\n" +
                        "Caml\n" +
                        "Ceylon\n" +
                        "CFML\n" +
                        "cg\n" +
                        "Ch\n" +
                        "CHILL\n" +
                        "CIL\n" +
                        "CL (OS/400)\n" +
                        "Clarion\n" +
                        "Clean\n" +
                        "Clipper\n" +
                        "Clojure\n" +
                        "CLU\n" +
                        "COBOL\n" +
                        "Cobra\n" +
                        "CoffeeScript\n" +
                        "ColdFusion\n" +
                        "COMAL\n" +
                        "Common Lisp\n" +
                        "Coq\n" +
                        "cT\n" +
                        "Curl\n" +
                        "D\n" +
                        "Dart\n" +
                        "DCL\n" +
                        "DCPU-16 ASM\n" +
                        "Delphi/Object Pascal\n" +
                        "DiBOL\n" +
                        "Dylan\n" +
                        "E\n" +
                        "eC\n" +
                        "Ecl\n" +
                        "ECMAScript\n" +
                        "EGL\n" +
                        "Eiffel\n" +
                        "Elixir\n" +
                        "Emacs Lisp\n" +
                        "Erlang\n" +
                        "Etoys\n" +
                        "Euphoria\n" +
                        "EXEC\n" +
                        "F#\n" +
                        "Factor\n" +
                        "Falcon\n" +
                        "Fancy\n" +
                        "Fantom\n" +
                        "Felix\n" +
                        "Forth\n" +
                        "Fortran\n" +
                        "Fortress\n" +
                        "(Visual) FoxPro\n" +
                        "Gambas\n" +
                        "GNU Octave\n" +
                        "Go\n" +
                        "Google AppsScript\n" +
                        "Gosu\n" +
                        "Groovy\n" +
                        "Haskell\n" +
                        "haXe\n" +
                        "Heron\n" +
                        "HPL\n" +
                        "HyperTalk\n" +
                        "Icon\n" +
                        "IDL\n" +
                        "Inform\n" +
                        "Informix-4GL\n" +
                        "INTERCAL\n" +
                        "Io\n" +
                        "Ioke\n" +
                        "J\n" +
                        "J#\n" +
                        "JADE\n" +
                        "Java\n" +
                        "Java FX Script\n" +
                        "JavaScript\n" +
                        "JScript\n" +
                        "JScript.NET\n" +
                        "Julia\n" +
                        "Korn Shell\n" +
                        "Kotlin\n" +
                        "LabVIEW\n" +
                        "Ladder Logic\n" +
                        "Lasso\n" +
                        "Limbo\n" +
                        "Lingo\n" +
                        "Lisp\n" +
                        "Logo\n" +
                        "Logtalk\n" +
                        "LotusScript\n" +
                        "LPC\n" +
                        "Lua\n" +
                        "Lustre\n" +
                        "M4\n" +
                        "MAD\n" +
                        "Magic\n" +
                        "Magik\n" +
                        "Malbolge\n" +
                        "MANTIS\n" +
                        "Maple\n" +
                        "Mathematica\n" +
                        "MATLAB\n" +
                        "Max/MSP\n" +
                        "MAXScript\n" +
                        "MEL\n" +
                        "Mercury\n" +
                        "Mirah\n" +
                        "Miva\n" +
                        "ML\n" +
                        "Monkey\n" +
                        "Modula-2\n" +
                        "Modula-3\n" +
                        "MOO\n" +
                        "Moto\n" +
                        "MS-DOS Batch\n" +
                        "MUMPS\n" +
                        "NATURAL\n" +
                        "Nemerle\n" +
                        "Nimrod\n" +
                        "NQC\n" +
                        "NSIS\n" +
                        "Nu\n" +
                        "NXT-G\n" +
                        "Oberon\n" +
                        "Object Rexx\n" +
                        "Objective-C\n" +
                        "Objective-J\n" +
                        "OCaml\n" +
                        "Occam\n" +
                        "ooc\n" +
                        "Opa\n" +
                        "OpenCL\n" +
                        "OpenEdge ABL\n" +
                        "OPL\n" +
                        "Oz\n" +
                        "Paradox\n" +
                        "Parrot\n" +
                        "Pascal\n" +
                        "Perl\n" +
                        "PHP\n" +
                        "Pike\n" +
                        "PILOT\n" +
                        "PL/I\n" +
                        "PL/SQL\n" +
                        "Pliant\n" +
                        "PostScript\n" +
                        "POV-Ray\n" +
                        "PowerBasic\n" +
                        "PowerScript\n" +
                        "PowerShell\n" +
                        "Processing\n" +
                        "Prolog\n" +
                        "Puppet\n" +
                        "Pure Data\n" +
                        "Python\n" +
                        "Q\n" +
                        "R\n" +
                        "Racket\n" +
                        "REALBasic\n" +
                        "REBOL\n" +
                        "Revolution\n" +
                        "REXX\n" +
                        "RPG (OS/400)\n" +
                        "Ruby\n" +
                        "Rust\n" +
                        "S\n" +
                        "S-PLUS\n" +
                        "SAS\n" +
                        "Sather\n" +
                        "Scala\n" +
                        "Scheme\n" +
                        "Scilab\n" +
                        "Scratch\n" +
                        "sed\n" +
                        "Seed7\n" +
                        "Self\n" +
                        "Shell\n" +
                        "SIGNAL\n" +
                        "Simula\n" +
                        "Simulink\n" +
                        "Slate\n" +
                        "Smalltalk\n" +
                        "Smarty\n" +
                        "SPARK\n" +
                        "SPSS\n" +
                        "SQR\n" +
                        "Squeak\n" +
                        "Squirrel\n" +
                        "Standard ML\n" +
                        "Suneido\n" +
                        "SuperCollider\n" +
                        "TACL\n" +
                        "Tcl\n" +
                        "Tex\n" +
                        "thinBasic\n" +
                        "TOM\n" +
                        "Transact-SQL\n" +
                        "Turing\n" +
                        "TypeScript\n" +
                        "Vala/Genie\n" +
                        "VBScript\n" +
                        "Verilog\n" +
                        "VHDL\n" +
                        "VimL\n" +
                        "Visual Basic .NET\n" +
                        "WebDNA\n" +
                        "Whitespace\n" +
                        "X10\n" +
                        "xBase\n" +
                        "XBase++\n" +
                        "Xen\n" +
                        "XPL\n" +
                        "XSLT\n" +
                        "XQuery\n" +
                        "yacc\n" +
                        "Yorick\n" +
                        "Z shell")).stream().map(e -> e.toLowerCase()).collect(Collectors.toList());
        largeSkills.addAll(skills);


        String skillBlob = "• Participate in technology project delivery activities such as gathering Business " +
                "requirements, conceptual approach, design, development, test case preparation, " +
                "unit/integration test execution, support process documentation\nAspectJ" +
                "• Develop the source to target mapping documents and ETL code to load data from source to target " +
                "systems\n• Develop workflows and ETL using Hive scripts, Sqoop, Pig, oozie, Spark and other utilities " +
                "on Hadoop\n• Build analytical applications using Hadoop eco system using packaged or open source " +
                "technologies\n• Partner with IT groups such as CIT, Engineering, Product, Security, and " +
                "Infrastructure on project delivery activities\n• Provide insights from data and present to IT and " +
                "non-technical users to improve operations and productivity\n• Unit test data loads and write scripts " +
                "for data validation\n• Support QA, UAT and performance testing phases of development cycle and " +
                "implement DevOps principles from development to deployment to production Qualifications\n";

        System.out.println("Input Size: " + skillBlob.length());

        List<ProgrammingSkill> stringMatches = skillsFinder.inTextBlob(largeSkills, skillBlob);
        Set<ProgrammingSkill> skillSet = stringMatches
                .stream()
                .collect(Collectors.toSet());
        skillSet.forEach(skill -> System.out.println(skill));

        assertEquals(21, skillSet.size());

    }

    @Test
    public void should_return_empty_if_no_matches() {
        List<ProgrammingSkill> skillMatches = skillsFinder.inTextBlob(Lists.newArrayList("hadoop, spark"), "not a big data developer");
        assertEquals(Collections.emptyList(),skillMatches);

    }


    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void should_check_for_null_arguments() {

        thrown.expect(IllegalArgumentException.class);
        skillsFinder.inTextBlob(null,null);

    }




}