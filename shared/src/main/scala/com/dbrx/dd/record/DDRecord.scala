/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package com.dbrx.dd.record

import scala.annotation.switch

final case class DDRecord(var dra_id: String = "", var market_shortname: String = "", var is_prod: Boolean = false, var common_assignment_run_id: String = "", var assignment_run_id: String = "", var sp_set_id: String = "", var event_created_at: Long = -9223372036854775808L, var shift_id: Long = -9223372036854775808L, var sp_id: Long = -9223372036854775808L, var cur_route: String = "", var raw_route: String = "", var is_idle_shift: Boolean = false, var shift_lat: Double = -1.7976931348623157E308, var shift_lng: Double = -1.7976931348623157E308, var on_manual_assign: Boolean = false, var scheduled_end_time: Long = -9223372036854775808L, var scheduled_start_time: Long = -9223372036854775808L, var soft_skills: String = "", var dasher_age: Long = -9223372036854775808L, var can_assign_cash_order: Boolean = false, var requires_marqueta: Boolean = false, var dasher_score: Long = -9223372036854775808L, var is_equipped: Boolean = false, var is_first_shift: Boolean = false, var is_top_dasher: Boolean = false, var is_high_ar_top_dasher: Boolean = false, var cur_route_type: String = "", var ideal_flf: Double = -1.7976931348623157E308, var flf: Double = -1.7976931348623157E308, var route_is_all_pickup_before_dropoff: Boolean = false, var acceptance_rate_on_check_in: Double = -1.7976931348623157E308, var vehicle_type: String = "", var dasher_id: Long = -9223372036854775808L, var enroute_delivery_info: String = "", var metadata: String = "", var metadata_json: String = "", var source: String = "", var home_starting_point: Long = -9223372036854775808L, var latest_hub_check_in_time: String = "", var total_pay: Long = -9223372036854775808L, var tip_amount: Long = -9223372036854775808L, var num_deliveries: Long = -9223372036854775808L, var delivery_pay: Long = -9223372036854775808L, var commute_expire_time: String = "", var commute_name: String = "", var commute_end_destination_lat: Double = -1.7976931348623157E308, var commute_end_destination_lng: Double = -1.7976931348623157E308, var max_total_distance: Double = -1.7976931348623157E308, var max_r2c_distance: Double = -1.7976931348623157E308, var high_paying_order_eligibility: String = "", var dsd_dx_pickscore: Double = -1.7976931348623157E308, var is_waiting_for_assignment: Boolean = false, var should_consider_for_delivery_packages: Boolean = false, var last_unassigned_at: String = "", var supported_taskgroup_types: String = "", var earnings_mode: String = "", var next_location_lat: Double = -1.7976931348623157E308, var next_location_lng: Double = -1.7976931348623157E308, var EVENT_NAME: String = "", var EVENT_TIME: Long = -9223372036854775808L, var IDEMPOTENCY_KEY: String = "", var ENTITY_NAME: String = "", var CUSOTOM_ATTRIBUTES: String = "", var EVENT_VERSION: Int = -2147483648, var EVENT_HOUR: String = "") extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this("", "", false, "", "", "", -9223372036854775808L, -9223372036854775808L, -9223372036854775808L, "", "", false, -1.7976931348623157E308, -1.7976931348623157E308, false, -9223372036854775808L, -9223372036854775808L, "", -9223372036854775808L, false, false, -9223372036854775808L, false, false, false, false, "", -1.7976931348623157E308, -1.7976931348623157E308, false, -1.7976931348623157E308, "", -9223372036854775808L, "", "", "", "", -9223372036854775808L, "", -9223372036854775808L, -9223372036854775808L, -9223372036854775808L, -9223372036854775808L, "", "", -1.7976931348623157E308, -1.7976931348623157E308, -1.7976931348623157E308, -1.7976931348623157E308, "", -1.7976931348623157E308, false, false, "", "", "", -1.7976931348623157E308, -1.7976931348623157E308, "", -9223372036854775808L, "", "", "", -2147483648, "")
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        dra_id
      }.asInstanceOf[AnyRef]
      case 1 => {
        market_shortname
      }.asInstanceOf[AnyRef]
      case 2 => {
        is_prod
      }.asInstanceOf[AnyRef]
      case 3 => {
        common_assignment_run_id
      }.asInstanceOf[AnyRef]
      case 4 => {
        assignment_run_id
      }.asInstanceOf[AnyRef]
      case 5 => {
        sp_set_id
      }.asInstanceOf[AnyRef]
      case 6 => {
        event_created_at
      }.asInstanceOf[AnyRef]
      case 7 => {
        shift_id
      }.asInstanceOf[AnyRef]
      case 8 => {
        sp_id
      }.asInstanceOf[AnyRef]
      case 9 => {
        cur_route
      }.asInstanceOf[AnyRef]
      case 10 => {
        raw_route
      }.asInstanceOf[AnyRef]
      case 11 => {
        is_idle_shift
      }.asInstanceOf[AnyRef]
      case 12 => {
        shift_lat
      }.asInstanceOf[AnyRef]
      case 13 => {
        shift_lng
      }.asInstanceOf[AnyRef]
      case 14 => {
        on_manual_assign
      }.asInstanceOf[AnyRef]
      case 15 => {
        scheduled_end_time
      }.asInstanceOf[AnyRef]
      case 16 => {
        scheduled_start_time
      }.asInstanceOf[AnyRef]
      case 17 => {
        soft_skills
      }.asInstanceOf[AnyRef]
      case 18 => {
        dasher_age
      }.asInstanceOf[AnyRef]
      case 19 => {
        can_assign_cash_order
      }.asInstanceOf[AnyRef]
      case 20 => {
        requires_marqueta
      }.asInstanceOf[AnyRef]
      case 21 => {
        dasher_score
      }.asInstanceOf[AnyRef]
      case 22 => {
        is_equipped
      }.asInstanceOf[AnyRef]
      case 23 => {
        is_first_shift
      }.asInstanceOf[AnyRef]
      case 24 => {
        is_top_dasher
      }.asInstanceOf[AnyRef]
      case 25 => {
        is_high_ar_top_dasher
      }.asInstanceOf[AnyRef]
      case 26 => {
        cur_route_type
      }.asInstanceOf[AnyRef]
      case 27 => {
        ideal_flf
      }.asInstanceOf[AnyRef]
      case 28 => {
        flf
      }.asInstanceOf[AnyRef]
      case 29 => {
        route_is_all_pickup_before_dropoff
      }.asInstanceOf[AnyRef]
      case 30 => {
        acceptance_rate_on_check_in
      }.asInstanceOf[AnyRef]
      case 31 => {
        vehicle_type
      }.asInstanceOf[AnyRef]
      case 32 => {
        dasher_id
      }.asInstanceOf[AnyRef]
      case 33 => {
        enroute_delivery_info
      }.asInstanceOf[AnyRef]
      case 34 => {
        metadata
      }.asInstanceOf[AnyRef]
      case 35 => {
        metadata_json
      }.asInstanceOf[AnyRef]
      case 36 => {
        source
      }.asInstanceOf[AnyRef]
      case 37 => {
        home_starting_point
      }.asInstanceOf[AnyRef]
      case 38 => {
        latest_hub_check_in_time
      }.asInstanceOf[AnyRef]
      case 39 => {
        total_pay
      }.asInstanceOf[AnyRef]
      case 40 => {
        tip_amount
      }.asInstanceOf[AnyRef]
      case 41 => {
        num_deliveries
      }.asInstanceOf[AnyRef]
      case 42 => {
        delivery_pay
      }.asInstanceOf[AnyRef]
      case 43 => {
        commute_expire_time
      }.asInstanceOf[AnyRef]
      case 44 => {
        commute_name
      }.asInstanceOf[AnyRef]
      case 45 => {
        commute_end_destination_lat
      }.asInstanceOf[AnyRef]
      case 46 => {
        commute_end_destination_lng
      }.asInstanceOf[AnyRef]
      case 47 => {
        max_total_distance
      }.asInstanceOf[AnyRef]
      case 48 => {
        max_r2c_distance
      }.asInstanceOf[AnyRef]
      case 49 => {
        high_paying_order_eligibility
      }.asInstanceOf[AnyRef]
      case 50 => {
        dsd_dx_pickscore
      }.asInstanceOf[AnyRef]
      case 51 => {
        is_waiting_for_assignment
      }.asInstanceOf[AnyRef]
      case 52 => {
        should_consider_for_delivery_packages
      }.asInstanceOf[AnyRef]
      case 53 => {
        last_unassigned_at
      }.asInstanceOf[AnyRef]
      case 54 => {
        supported_taskgroup_types
      }.asInstanceOf[AnyRef]
      case 55 => {
        earnings_mode
      }.asInstanceOf[AnyRef]
      case 56 => {
        next_location_lat
      }.asInstanceOf[AnyRef]
      case 57 => {
        next_location_lng
      }.asInstanceOf[AnyRef]
      case 58 => {
        EVENT_NAME
      }.asInstanceOf[AnyRef]
      case 59 => {
        EVENT_TIME
      }.asInstanceOf[AnyRef]
      case 60 => {
        IDEMPOTENCY_KEY
      }.asInstanceOf[AnyRef]
      case 61 => {
        ENTITY_NAME
      }.asInstanceOf[AnyRef]
      case 62 => {
        CUSOTOM_ATTRIBUTES
      }.asInstanceOf[AnyRef]
      case 63 => {
        EVENT_VERSION
      }.asInstanceOf[AnyRef]
      case 64 => {
        EVENT_HOUR
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.dra_id = {
        value.toString
      }.asInstanceOf[String]
      case 1 => this.market_shortname = {
        value.toString
      }.asInstanceOf[String]
      case 2 => this.is_prod = {
        value
      }.asInstanceOf[Boolean]
      case 3 => this.common_assignment_run_id = {
        value.toString
      }.asInstanceOf[String]
      case 4 => this.assignment_run_id = {
        value.toString
      }.asInstanceOf[String]
      case 5 => this.sp_set_id = {
        value.toString
      }.asInstanceOf[String]
      case 6 => this.event_created_at = {
        value
      }.asInstanceOf[Long]
      case 7 => this.shift_id = {
        value
      }.asInstanceOf[Long]
      case 8 => this.sp_id = {
        value
      }.asInstanceOf[Long]
      case 9 => this.cur_route = {
        value.toString
      }.asInstanceOf[String]
      case 10 => this.raw_route = {
        value.toString
      }.asInstanceOf[String]
      case 11 => this.is_idle_shift = {
        value
      }.asInstanceOf[Boolean]
      case 12 => this.shift_lat = {
        value
      }.asInstanceOf[Double]
      case 13 => this.shift_lng = {
        value
      }.asInstanceOf[Double]
      case 14 => this.on_manual_assign = {
        value
      }.asInstanceOf[Boolean]
      case 15 => this.scheduled_end_time = {
        value
      }.asInstanceOf[Long]
      case 16 => this.scheduled_start_time = {
        value
      }.asInstanceOf[Long]
      case 17 => this.soft_skills = {
        value.toString
      }.asInstanceOf[String]
      case 18 => this.dasher_age = {
        value
      }.asInstanceOf[Long]
      case 19 => this.can_assign_cash_order = {
        value
      }.asInstanceOf[Boolean]
      case 20 => this.requires_marqueta = {
        value
      }.asInstanceOf[Boolean]
      case 21 => this.dasher_score = {
        value
      }.asInstanceOf[Long]
      case 22 => this.is_equipped = {
        value
      }.asInstanceOf[Boolean]
      case 23 => this.is_first_shift = {
        value
      }.asInstanceOf[Boolean]
      case 24 => this.is_top_dasher = {
        value
      }.asInstanceOf[Boolean]
      case 25 => this.is_high_ar_top_dasher = {
        value
      }.asInstanceOf[Boolean]
      case 26 => this.cur_route_type = {
        value.toString
      }.asInstanceOf[String]
      case 27 => this.ideal_flf = {
        value
      }.asInstanceOf[Double]
      case 28 => this.flf = {
        value
      }.asInstanceOf[Double]
      case 29 => this.route_is_all_pickup_before_dropoff = {
        value
      }.asInstanceOf[Boolean]
      case 30 => this.acceptance_rate_on_check_in = {
        value
      }.asInstanceOf[Double]
      case 31 => this.vehicle_type = {
        value.toString
      }.asInstanceOf[String]
      case 32 => this.dasher_id = {
        value
      }.asInstanceOf[Long]
      case 33 => this.enroute_delivery_info = {
        value.toString
      }.asInstanceOf[String]
      case 34 => this.metadata = {
        value.toString
      }.asInstanceOf[String]
      case 35 => this.metadata_json = {
        value.toString
      }.asInstanceOf[String]
      case 36 => this.source = {
        value.toString
      }.asInstanceOf[String]
      case 37 => this.home_starting_point = {
        value
      }.asInstanceOf[Long]
      case 38 => this.latest_hub_check_in_time = {
        value.toString
      }.asInstanceOf[String]
      case 39 => this.total_pay = {
        value
      }.asInstanceOf[Long]
      case 40 => this.tip_amount = {
        value
      }.asInstanceOf[Long]
      case 41 => this.num_deliveries = {
        value
      }.asInstanceOf[Long]
      case 42 => this.delivery_pay = {
        value
      }.asInstanceOf[Long]
      case 43 => this.commute_expire_time = {
        value.toString
      }.asInstanceOf[String]
      case 44 => this.commute_name = {
        value.toString
      }.asInstanceOf[String]
      case 45 => this.commute_end_destination_lat = {
        value
      }.asInstanceOf[Double]
      case 46 => this.commute_end_destination_lng = {
        value
      }.asInstanceOf[Double]
      case 47 => this.max_total_distance = {
        value
      }.asInstanceOf[Double]
      case 48 => this.max_r2c_distance = {
        value
      }.asInstanceOf[Double]
      case 49 => this.high_paying_order_eligibility = {
        value.toString
      }.asInstanceOf[String]
      case 50 => this.dsd_dx_pickscore = {
        value
      }.asInstanceOf[Double]
      case 51 => this.is_waiting_for_assignment = {
        value
      }.asInstanceOf[Boolean]
      case 52 => this.should_consider_for_delivery_packages = {
        value
      }.asInstanceOf[Boolean]
      case 53 => this.last_unassigned_at = {
        value.toString
      }.asInstanceOf[String]
      case 54 => this.supported_taskgroup_types = {
        value.toString
      }.asInstanceOf[String]
      case 55 => this.earnings_mode = {
        value.toString
      }.asInstanceOf[String]
      case 56 => this.next_location_lat = {
        value
      }.asInstanceOf[Double]
      case 57 => this.next_location_lng = {
        value
      }.asInstanceOf[Double]
      case 58 => this.EVENT_NAME = {
        value.toString
      }.asInstanceOf[String]
      case 59 => this.EVENT_TIME = {
        value
      }.asInstanceOf[Long]
      case 60 => this.IDEMPOTENCY_KEY = {
        value.toString
      }.asInstanceOf[String]
      case 61 => this.ENTITY_NAME = {
        value.toString
      }.asInstanceOf[String]
      case 62 => this.CUSOTOM_ATTRIBUTES = {
        value.toString
      }.asInstanceOf[String]
      case 63 => this.EVENT_VERSION = {
        value
      }.asInstanceOf[Int]
      case 64 => this.EVENT_HOUR = {
        value.toString
      }.asInstanceOf[String]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = DDRecord.SCHEMA$
}

object DDRecord {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DDRecord\",\"namespace\":\"com.dbrx.dd.record\",\"fields\":[{\"name\":\"dra_id\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"market_shortname\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"is_prod\",\"type\":\"boolean\",\"default\":false},{\"name\":\"common_assignment_run_id\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"assignment_run_id\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"sp_set_id\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"event_created_at\",\"type\":\"long\",\"default\":-9223372036854775808},{\"name\":\"shift_id\",\"type\":\"long\",\"default\":-9223372036854775808},{\"name\":\"sp_id\",\"type\":\"long\",\"default\":-9223372036854775808},{\"name\":\"cur_route\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"raw_route\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"is_idle_shift\",\"type\":\"boolean\",\"default\":false},{\"name\":\"shift_lat\",\"type\":\"double\",\"default\":-1.7976931348623157E308},{\"name\":\"shift_lng\",\"type\":\"double\",\"default\":-1.7976931348623157E308},{\"name\":\"on_manual_assign\",\"type\":\"boolean\",\"default\":false},{\"name\":\"scheduled_end_time\",\"type\":\"long\",\"default\":-9223372036854775808},{\"name\":\"scheduled_start_time\",\"type\":\"long\",\"default\":-9223372036854775808},{\"name\":\"soft_skills\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"dasher_age\",\"type\":\"long\",\"default\":-9223372036854775808},{\"name\":\"can_assign_cash_order\",\"type\":\"boolean\",\"default\":false},{\"name\":\"requires_marqueta\",\"type\":\"boolean\",\"default\":false},{\"name\":\"dasher_score\",\"type\":\"long\",\"default\":-9223372036854775808},{\"name\":\"is_equipped\",\"type\":\"boolean\",\"default\":false},{\"name\":\"is_first_shift\",\"type\":\"boolean\",\"default\":false},{\"name\":\"is_top_dasher\",\"type\":\"boolean\",\"default\":false},{\"name\":\"is_high_ar_top_dasher\",\"type\":\"boolean\",\"default\":false},{\"name\":\"cur_route_type\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"ideal_flf\",\"type\":\"double\",\"default\":-1.7976931348623157E308},{\"name\":\"flf\",\"type\":\"double\",\"default\":-1.7976931348623157E308},{\"name\":\"route_is_all_pickup_before_dropoff\",\"type\":\"boolean\",\"default\":false},{\"name\":\"acceptance_rate_on_check_in\",\"type\":\"double\",\"default\":-1.7976931348623157E308},{\"name\":\"vehicle_type\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"dasher_id\",\"type\":\"long\",\"default\":-9223372036854775808},{\"name\":\"enroute_delivery_info\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"metadata\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"metadata_json\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"source\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"home_starting_point\",\"type\":\"long\",\"default\":-9223372036854775808},{\"name\":\"latest_hub_check_in_time\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"total_pay\",\"type\":\"long\",\"default\":-9223372036854775808},{\"name\":\"tip_amount\",\"type\":\"long\",\"default\":-9223372036854775808},{\"name\":\"num_deliveries\",\"type\":\"long\",\"default\":-9223372036854775808},{\"name\":\"delivery_pay\",\"type\":\"long\",\"default\":-9223372036854775808},{\"name\":\"commute_expire_time\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"commute_name\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"commute_end_destination_lat\",\"type\":\"double\",\"default\":-1.7976931348623157E308},{\"name\":\"commute_end_destination_lng\",\"type\":\"double\",\"default\":-1.7976931348623157E308},{\"name\":\"max_total_distance\",\"type\":\"double\",\"default\":-1.7976931348623157E308},{\"name\":\"max_r2c_distance\",\"type\":\"double\",\"default\":-1.7976931348623157E308},{\"name\":\"high_paying_order_eligibility\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"dsd_dx_pickscore\",\"type\":\"double\",\"default\":-1.7976931348623157E308},{\"name\":\"is_waiting_for_assignment\",\"type\":\"boolean\",\"default\":false},{\"name\":\"should_consider_for_delivery_packages\",\"type\":\"boolean\",\"default\":false},{\"name\":\"last_unassigned_at\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"supported_taskgroup_types\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"earnings_mode\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"next_location_lat\",\"type\":\"double\",\"default\":-1.7976931348623157E308},{\"name\":\"next_location_lng\",\"type\":\"double\",\"default\":-1.7976931348623157E308},{\"name\":\"EVENT_NAME\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"EVENT_TIME\",\"type\":\"long\",\"default\":-9223372036854775808},{\"name\":\"IDEMPOTENCY_KEY\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"ENTITY_NAME\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"CUSOTOM_ATTRIBUTES\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"EVENT_VERSION\",\"type\":\"int\",\"default\":-2147483648},{\"name\":\"EVENT_HOUR\",\"type\":\"string\",\"default\":\"\"}]}")
}