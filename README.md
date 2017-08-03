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
mvn -DexcludedGroups="co.speedar.integration.ITInSuite,co.speedar.integration.OtherCategory" failsafe:integration-test failsafe:verify
```
## run other category tests:
```bash
mvn -DexcludedGroups="co.speedar.integration.ITInSuite,co.speedar.integration.ITNotInSuite" failsafe:integration-test failsafe:verify
```
## install:
```bash
mvn install -Dmaven.test.skip=true
```
## reference:
[how-to-split-junit-tests-in-a-continuous-integration-environment](https://semaphoreci.com/community/tutorials/how-to-split-junit-tests-in-a-continuous-integration-environment)<br/>
[categories](https://github.com/junit-team/junit4/wiki/categories)<br/>
[failsafe inclusion-exclusion](http://maven.apache.org/components/surefire/maven-failsafe-plugin/examples/inclusion-exclusion.html)<br/>
[run-junit-suite-using-maven-command](https://stackoverflow.com/questions/11762801/run-junit-suite-using-maven-command)<br/>
