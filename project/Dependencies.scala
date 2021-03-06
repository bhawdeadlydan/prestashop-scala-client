/*
 * Copyright (c) 2012 Orderly Ltd. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
import sbt._

object Dependencies {
  val resolutionRepos = Seq(
    ScalaToolsSnapshots,
    "EclipseLink Repo" at "http://download.eclipse.org/rt/eclipselink/maven.repo",
    "Orderly Repo" at "http://repo.orderly.co/releases/"
  )

  object V {
    val jackson    = "1.9.1"
    val moxy       = "2.3.0"
    val narcolepsy = "0.2.5"
  }

  object Runtime {

    // Narcolepsy
    val narcolepsy  = "co.orderly"                % "narcolepsy-scala"    % V.narcolepsy

    // Jackson required to compile the orderly-representations. Note we use the Apache licensed versions
    val jackCore    = "org.codehaus.jackson"      % "jackson-core-asl"    % V.jackson
    val jackMapper  = "org.codehaus.jackson"      % "jackson-mapper-asl"  % V.jackson
    val jackXc      = "org.codehaus.jackson"      % "jackson-xc"          % V.jackson

    // We use Moxy for the naming convention transforms
    val moxy        = "org.eclipse.persistence"   % "eclipselink"         % V.moxy
  }
}
