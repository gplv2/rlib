/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version: 1.3.21
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class rlib {
  public static SWIGTYPE_p_rlib rlib_init() {
    long cPtr = rlibJNI.rlib_init();
    return (cPtr == 0) ? null : new SWIGTYPE_p_rlib(cPtr, false);
  }

  public static int rlib_add_datasource_mysql(SWIGTYPE_p_rlib r, String input_name, String database_host, String database_user, String database_password, String database_database) {
    return rlibJNI.rlib_add_datasource_mysql(SWIGTYPE_p_rlib.getCPtr(r), input_name, database_host, database_user, database_password, database_database);
  }

  public static int rlib_add_datasource_postgres(SWIGTYPE_p_rlib r, String input_name, String conn) {
    return rlibJNI.rlib_add_datasource_postgres(SWIGTYPE_p_rlib.getCPtr(r), input_name, conn);
  }

  public static int rlib_add_datasource_odbc(SWIGTYPE_p_rlib r, String input_name, String source, String user, String password) {
    return rlibJNI.rlib_add_datasource_odbc(SWIGTYPE_p_rlib.getCPtr(r), input_name, source, user, password);
  }

  public static int rlib_add_datasource_xml(SWIGTYPE_p_rlib r, String input_name) {
    return rlibJNI.rlib_add_datasource_xml(SWIGTYPE_p_rlib.getCPtr(r), input_name);
  }

  public static int rlib_add_datasource_csv(SWIGTYPE_p_rlib r, String input_name) {
    return rlibJNI.rlib_add_datasource_csv(SWIGTYPE_p_rlib.getCPtr(r), input_name);
  }

  public static int rlib_add_query_as(SWIGTYPE_p_rlib r, String input_source, String sql, String name) {
    return rlibJNI.rlib_add_query_as(SWIGTYPE_p_rlib.getCPtr(r), input_source, sql, name);
  }

  public static int rlib_add_report(SWIGTYPE_p_rlib r, String name) {
    return rlibJNI.rlib_add_report(SWIGTYPE_p_rlib.getCPtr(r), name);
  }

  public static int rlib_add_report_from_buffer(SWIGTYPE_p_rlib r, String buffer) {
    return rlibJNI.rlib_add_report_from_buffer(SWIGTYPE_p_rlib.getCPtr(r), buffer);
  }

  public static int rlib_execute(SWIGTYPE_p_rlib r) {
    return rlibJNI.rlib_execute(SWIGTYPE_p_rlib.getCPtr(r));
  }

  public static String rlib_get_content_type_as_text(SWIGTYPE_p_rlib r) {
    return rlibJNI.rlib_get_content_type_as_text(SWIGTYPE_p_rlib.getCPtr(r));
  }

  public static int rlib_spool(SWIGTYPE_p_rlib r) {
    return rlibJNI.rlib_spool(SWIGTYPE_p_rlib.getCPtr(r));
  }

  public static int rlib_set_output_format(SWIGTYPE_p_rlib r, int format) {
    return rlibJNI.rlib_set_output_format(SWIGTYPE_p_rlib.getCPtr(r), format);
  }

  public static int rlib_add_resultset_follower_n_to_1(SWIGTYPE_p_rlib r, String leader, String leader_field, String follower, String follower_field) {
    return rlibJNI.rlib_add_resultset_follower_n_to_1(SWIGTYPE_p_rlib.getCPtr(r), leader, leader_field, follower, follower_field);
  }

  public static int rlib_add_resultset_follower(SWIGTYPE_p_rlib r, String leader, String follower) {
    return rlibJNI.rlib_add_resultset_follower(SWIGTYPE_p_rlib.getCPtr(r), leader, follower);
  }

  public static int rlib_set_output_format_from_text(SWIGTYPE_p_rlib r, String name) {
    return rlibJNI.rlib_set_output_format_from_text(SWIGTYPE_p_rlib.getCPtr(r), name);
  }

  public static String rlib_get_output(SWIGTYPE_p_rlib r) {
    return rlibJNI.rlib_get_output(SWIGTYPE_p_rlib.getCPtr(r));
  }

  public static int rlib_get_output_length(SWIGTYPE_p_rlib r) {
    return rlibJNI.rlib_get_output_length(SWIGTYPE_p_rlib.getCPtr(r));
  }

  public static int rlib_signal_connect(SWIGTYPE_p_rlib r, int signal_number, SWIGTYPE_p_f_p_rlib_p_void__int signal_function, SWIGTYPE_p_void data) {
    return rlibJNI.rlib_signal_connect(SWIGTYPE_p_rlib.getCPtr(r), signal_number, SWIGTYPE_p_f_p_rlib_p_void__int.getCPtr(signal_function), SWIGTYPE_p_void.getCPtr(data));
  }

  public static int rlib_signal_connect_string(SWIGTYPE_p_rlib r, String signal_name, SWIGTYPE_p_f_p_rlib_p_void__int signal_function, SWIGTYPE_p_void data) {
    return rlibJNI.rlib_signal_connect_string(SWIGTYPE_p_rlib.getCPtr(r), signal_name, SWIGTYPE_p_f_p_rlib_p_void__int.getCPtr(signal_function), SWIGTYPE_p_void.getCPtr(data));
  }

  public static int rlib_query_refresh(SWIGTYPE_p_rlib r) {
    return rlibJNI.rlib_query_refresh(SWIGTYPE_p_rlib.getCPtr(r));
  }

  public static int rlib_add_parameter(SWIGTYPE_p_rlib r, String name, String value) {
    return rlibJNI.rlib_add_parameter(SWIGTYPE_p_rlib.getCPtr(r), name, value);
  }

  public static int rlib_set_locale(SWIGTYPE_p_rlib r, String locale) {
    return rlibJNI.rlib_set_locale(SWIGTYPE_p_rlib.getCPtr(r), locale);
  }

  public static void rlib_set_output_parameter(SWIGTYPE_p_rlib r, String parameter, String value) {
    rlibJNI.rlib_set_output_parameter(SWIGTYPE_p_rlib.getCPtr(r), parameter, value);
  }

  public static void rlib_set_output_encoding(SWIGTYPE_p_rlib r, String encoding) {
    rlibJNI.rlib_set_output_encoding(SWIGTYPE_p_rlib.getCPtr(r), encoding);
  }

  public static int rlib_set_datasource_encoding(SWIGTYPE_p_rlib r, String input_name, String encoding) {
    return rlibJNI.rlib_set_datasource_encoding(SWIGTYPE_p_rlib.getCPtr(r), input_name, encoding);
  }

  public static int rlib_free(SWIGTYPE_p_rlib r) {
    return rlibJNI.rlib_free(SWIGTYPE_p_rlib.getCPtr(r));
  }

  public static String rlib_version() {
    return rlibJNI.rlib_version();
  }

  public static int rlib_graph_add_bg_region(SWIGTYPE_p_rlib r, String graph_name, String region_label, String color, float start, float end) {
    return rlibJNI.rlib_graph_add_bg_region(SWIGTYPE_p_rlib.getCPtr(r), graph_name, region_label, color, start, end);
  }

  public static int rlib_graph_clear_bg_region(SWIGTYPE_p_rlib r, String graph_name) {
    return rlibJNI.rlib_graph_clear_bg_region(SWIGTYPE_p_rlib.getCPtr(r), graph_name);
  }

  public static int rlib_graph_set_x_minor_tick(SWIGTYPE_p_rlib r, String graph_name, String x_value) {
    return rlibJNI.rlib_graph_set_x_minor_tick(SWIGTYPE_p_rlib.getCPtr(r), graph_name, x_value);
  }

  public static int rlib_graph_set_x_minor_tick_by_location(SWIGTYPE_p_rlib r, String graph_name, int location) {
    return rlibJNI.rlib_graph_set_x_minor_tick_by_location(SWIGTYPE_p_rlib.getCPtr(r), graph_name, location);
  }

}
