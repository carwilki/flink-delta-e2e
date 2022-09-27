package com.dbrx.dd.record

import org.scalacheck.rng.Seed

import scala.util.Random

object RecordGenerator {

  import org.scalacheck._

  implicit val recordArbitrary: Arbitrary[DDRecord] = Arbitrary(
    for {
      dra_id <- Arbitrary.arbUuid.arbitrary.map(x => x.toString)
      market_shortname <- Arbitrary.arbString.arbitrary
      is_prod <- Arbitrary.arbBool.arbitrary
      common_assignment_run_id <- Arbitrary.arbUuid.arbitrary.map(x => x.toString)
      assignment_run_id <- Arbitrary.arbUuid.arbitrary.map(x => x.toString)
      sp_set_id <- Arbitrary.arbUuid.arbitrary.map(x => x.toString)
      event_created_at <- Arbitrary.arbZonedDateTime.arbitrary.map(_.toEpochSecond)
      shift_id <- Arbitrary.arbLong.arbitrary
      sp_id <- Arbitrary.arbLong.arbitrary
      cur_route <- Arbitrary.arbString.arbitrary
      raw_route <- Arbitrary.arbString.arbitrary
      is_idle_shift <- Arbitrary.arbBool.arbitrary
      shift_lat <- Arbitrary.arbDouble.arbitrary
      shift_lng <- Arbitrary.arbDouble.arbitrary
      on_manual_assign <- Arbitrary.arbBool.arbitrary
      scheduled_end_time <- Arbitrary.arbZonedDateTime.arbitrary.map(_.toEpochSecond)
      scheduled_start_time <- Arbitrary.arbZonedDateTime.arbitrary.map(_.toEpochSecond)
      soft_skills <- Arbitrary.arbString.arbitrary
      dasher_age <- Arbitrary.arbLong.arbitrary
      can_assign_cash_order <- Arbitrary.arbBool.arbitrary
      requires_marqueta <- Arbitrary.arbBool.arbitrary
      dasher_score <- Arbitrary.arbLong.arbitrary
      is_equipped <- Arbitrary.arbBool.arbitrary
      is_first_shift <- Arbitrary.arbBool.arbitrary
      is_top_dasher <- Arbitrary.arbBool.arbitrary
      is_high_ar_top_dasher <- Arbitrary.arbBool.arbitrary
      cur_route_type <- Arbitrary.arbString.arbitrary
      ideal_flf <- Arbitrary.arbDouble.arbitrary
      flf <- Arbitrary.arbDouble.arbitrary
      route_is_all_pickup_before_dropoff <- Arbitrary.arbBool.arbitrary
      acceptance_rate_on_check_in <- Arbitrary.arbDouble.arbitrary
      vehicle_type <- Arbitrary.arbString.arbitrary
      dasher_id <- Arbitrary.arbLong.arbitrary
      enroute_delivery_info <- Arbitrary.arbString.arbitrary
      metadata <- Arbitrary.arbString.arbitrary
      metadata_json <- Arbitrary.arbString.arbitrary
      source <- Arbitrary.arbString.arbitrary
      home_starting_point <- Arbitrary.arbLong.arbitrary
      latest_hub_check_in_time <- Arbitrary.arbString.arbitrary
      total_pay <- Arbitrary.arbLong.arbitrary
      tip_amount <- Arbitrary.arbLong.arbitrary
      num_deliveries <- Arbitrary.arbLong.arbitrary
      delivery_pay <- Arbitrary.arbLong.arbitrary
      commute_expire_time <- Arbitrary.arbString.arbitrary
      commute_name <- Arbitrary.arbString.arbitrary
      commute_end_destination_lat <- Arbitrary.arbDouble.arbitrary
      commute_end_destination_lng <- Arbitrary.arbDouble.arbitrary
      max_total_distance <- Arbitrary.arbDouble.arbitrary
      max_r2c_distance <- Arbitrary.arbDouble.arbitrary
      high_paying_order_eligibility <- Arbitrary.arbString.arbitrary
      dsd_dx_pickscore <- Arbitrary.arbDouble.arbitrary
      is_waiting_for_assignment <- Arbitrary.arbBool.arbitrary
      should_consider_for_delivery_packages <- Arbitrary.arbBool.arbitrary
      last_unassigned_at <- Arbitrary.arbString.arbitrary
      supported_taskgroup_types <- Arbitrary.arbString.arbitrary
      earnings_mode <- Arbitrary.arbString.arbitrary
      next_location_lat <- Arbitrary.arbDouble.arbitrary
      next_location_lng <- Arbitrary.arbDouble.arbitrary
      eventName <- Arbitrary.arbString.arbitrary
      eventTime <- Arbitrary.arbZonedDateTime.arbitrary.map(_.toEpochSecond)
      idempotencyKey <- Arbitrary.arbUuid.arbitrary.map(x => x.toString)
      source <- Arbitrary.arbString.arbitrary
      entityName <- Arbitrary.arbString.arbitrary
      customAttributes <- Arbitrary.arbString.arbitrary
      eventVersion <- Arbitrary.arbInt.arbitrary
      eventHour <- Arbitrary.arbString.arbitrary
    }
    yield DDRecord(
      dra_id = dra_id,
      market_shortname = market_shortname,
      is_prod = is_prod,
      common_assignment_run_id = common_assignment_run_id,
      assignment_run_id = assignment_run_id,
      sp_set_id = sp_set_id,
      event_created_at = event_created_at,
      shift_id = shift_id,
      sp_id = sp_id,
      cur_route = cur_route,
      raw_route = raw_route,
      is_idle_shift = is_idle_shift,
      shift_lat = shift_lat,
      shift_lng = shift_lng,
      on_manual_assign = on_manual_assign,
      scheduled_end_time = scheduled_end_time,
      scheduled_start_time = scheduled_start_time,
      soft_skills = soft_skills,
      dasher_age = dasher_age,
      can_assign_cash_order = can_assign_cash_order,
      requires_marqueta = requires_marqueta,
      dasher_score = dasher_score,
      is_equipped = is_equipped,
      is_first_shift = is_first_shift,
      is_top_dasher = is_top_dasher,
      is_high_ar_top_dasher = is_high_ar_top_dasher,
      cur_route_type = cur_route_type,
      ideal_flf = ideal_flf,
      flf = flf,
      route_is_all_pickup_before_dropoff = route_is_all_pickup_before_dropoff,
      acceptance_rate_on_check_in = acceptance_rate_on_check_in,
      vehicle_type = vehicle_type,
      dasher_id = dasher_id,
      enroute_delivery_info = enroute_delivery_info,
      metadata = metadata,
      metadata_json = metadata_json,
      source = source,
      home_starting_point = home_starting_point,
      latest_hub_check_in_time = latest_hub_check_in_time,
      total_pay = total_pay,
      tip_amount = tip_amount,
      num_deliveries = num_deliveries,
      delivery_pay = delivery_pay,
      commute_expire_time = commute_expire_time,
      commute_name = commute_name,
      commute_end_destination_lat = commute_end_destination_lat,
      commute_end_destination_lng = commute_end_destination_lng,
      max_total_distance = max_total_distance,
      max_r2c_distance = max_r2c_distance,
      high_paying_order_eligibility = high_paying_order_eligibility,
      dsd_dx_pickscore = dsd_dx_pickscore,
      is_waiting_for_assignment = is_waiting_for_assignment,
      should_consider_for_delivery_packages = should_consider_for_delivery_packages,
      last_unassigned_at = last_unassigned_at,
      supported_taskgroup_types = supported_taskgroup_types,
      earnings_mode = earnings_mode,
      next_location_lat = next_location_lat,
      next_location_lng = next_location_lng,
      EVENT_NAME = eventName,
      EVENT_TIME = eventTime,
      IDEMPOTENCY_KEY = idempotencyKey,
      ENTITY_NAME = entityName,
      CUSOTOM_ATTRIBUTES = customAttributes,
      EVENT_VERSION = eventVersion,
      EVENT_HOUR = eventHour)
  )

  def next(): DDRecord = {
    recordArbitrary.arbitrary.pureApply(Gen.Parameters.default, Seed(Random.nextLong()))
  }
}
