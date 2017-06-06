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
mvn install
```
