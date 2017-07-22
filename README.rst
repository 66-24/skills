Skills
======

This project is to understand different search algorithms.
Currently using the _StringSearchAlgorithms:http://stringsearchalgorithms.amygdalum.net/index.html

- Uses the `Immutables <https://github.com/immutables/immutables/tree/master/ordinal/src/org/immutables/ordinal>` library to create classes with builders
- Uses the @NonNull annotation to generate `IllegalArgumentException` when passed a Null
- Uses the Option from `Fugue <https://bitbucket.org/atlassian/fugue>` which is serializable and supports functional operations such as map
  - `Why optional is broken <https://developer.atlassian.com/blog/2015/08/optional-broken/>`
  - `Map operator put back in java.util.Optional <http://mail.openjdk.java.net/pipermail/lambda-dev/2013-February/008346.html>`
- Uses `PIT testing <http://pitest.org/quickstart/maven/>`
    .. highlight:: bash
       :linenos:

        mvn -DwithHistory org.pitest:pitest-maven:mutationCoverage
    



TODO
====
 - `Pojo Testing <http://www.pojo.pl/why-use/>`

Notes
=====
- Did not try the Aho-Corasick algorithm due to memory issues with implementation at `scale <https://github.com/robert-bor/aho-corasick/issues/35>`