/*

 */

import org.apache.spark.sql.SparkSession

object Main {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("test")
      .master("local[*]").getOrCreate()
    spark.sql("select hash(cast('0.0' as double)), hash(cast('-0.0' as double))").show()
  }
}
