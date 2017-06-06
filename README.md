# failsafe-test
## clean, compile and run unit tests:
```bash
mvn clean compile test
```
## run integration tests in suite:
```bash
mvn failsafe:integration-test -Dit.test=ITSuite failsafe:verify
```
## run other integration tests:
```bash
mvn -DexcludedGroups="com.vipshop.osp.integration.ITInSuite" failsafe:integration-test failsafe:verify
```
## install:
```bash
mvn install -Dmaven.test.skip=true
```
## reference:
[how-to-split-junit-tests-in-a-continuous-integration-environment](https://semaphoreci.com/community/tutorials/how-to-split-junit-tests-in-a-continuous-integration-environment)
[categories](https://github.com/junit-team/junit4/wiki/categories)
[failsafe inclusion-exclusion](http://maven.apache.org/components/surefire/maven-failsafe-plugin/examples/inclusion-exclusion.html)
[run-junit-suite-using-maven-command](https://stackoverflow.com/questions/11762801/run-junit-suite-using-maven-command)
