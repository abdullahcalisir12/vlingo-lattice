# vlingo-lattice

[![Javadocs](http://javadoc.io/badge/io.vlingo/vlingo-lattice.svg?color=brightgreen)](http://javadoc.io/doc/io.vlingo/vlingo-lattice) [![Build](https://github.com/vlingo/vlingo-lattice/workflows/Build/badge.svg)](https://github.com/vlingo/vlingo-lattice/actions?query=workflow%3ABuild) [ ![Download](https://api.bintray.com/packages/vlingo/vlingo-platform-java/vlingo-lattice/images/download.svg) ](https://bintray.com/vlingo/vlingo-platform-java/vlingo-lattice/_latestVersion) [![Gitter chat](https://badges.gitter.im/gitterHQ/gitter.png)](https://gitter.im/vlingo-platform-java/lattice)

Docs: https://docs.vlingo.io/vlingo-lattice

The VLINGO/PLATFORM tooling for reactive Domain-Driven Design models that are highly concurrent. Includes compute grid, actor caching, spaces, cross-node cluster messaging, message exchanges, CQRS, and Event Sourcing support.

### Bintray

```xml
  <repositories>
    <repository>
      <id>jcenter</id>
      <url>https://jcenter.bintray.com/</url>
    </repository>
  </repositories>
  <dependencies>
    <dependency>
      <groupId>io.vlingo</groupId>
      <artifactId>vlingo-lattice</artifactId>
      <version>1.3.0</version>
      <scope>compile</scope>
    </dependency>
  </dependencies>
```

```gradle
dependencies {
    compile 'io.vlingo:vlingo-lattice:1.3.0'
}

repositories {
    jcenter()
}
```

License (See LICENSE file for full license)
-------------------------------------------
Copyright © 2012-2020 VLINGO LABS. All rights reserved.

This Source Code Form is subject to the terms of the
Mozilla Public License, v. 2.0. If a copy of the MPL
was not distributed with this file, You can obtain
one at https://mozilla.org/MPL/2.0/.


### Licenses for Dependencies

MurmurHash.java is open source licensed under Apache 2 by the Apache Software Foundation
http://www.apache.org/licenses/LICENSE-2.0

See: https://github.com/apache/cassandra/blob/trunk/src/java/org/apache/cassandra/utils/MurmurHash.java
