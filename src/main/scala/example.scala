/* Distributed as part of prestasac, an Amazon Product API client for Scala.
 *
 * Copyright (c) 2011 Alex Dean
 *
 * prestasac is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 *
 * prestasac is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public
 * License along with prestasac. If not, see <http://www.gnu.org/licenses/>.
 */
import co.orderly.prestasac.PrestaShopWebService

import scala.xml._

/**
 * Simple console example of an Amazon Product API call using scalapac
 */
object ExampleOperations {

  def main(args: Array[String]) {

    // Update this with your Amazon credentials before running
    val api = new PrestaShopWebService(
      apiURL = "[YOUR PRESTASHOP API URL HERE]",
      apiKey = "[YOUR PRESTASHOP AUTHENTICATION KEY HERE]",
      debug  = true // Debug prints out request URLs and response codes/headers/bodies
    )

    // Run some quick checks
    val x = api.get("products", 11)
    val y = api.head("products", 11) // Doesn't seem to work

    val z = api.get("stock_movements?schema=synopsis")
  }
}
