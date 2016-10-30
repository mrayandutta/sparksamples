
package sparksamples.basics

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark._
import org.apache.spark.sql.SQLContext
import sparksamples.common.EnvironmentConstants


object DataFrameExample 
{ 
   def main(args: Array[String]) 
   { 
      val sc = new SparkContext( "local", "Word Count",EnvironmentConstants.ScalaInstallationLocation, Nil, Map(), Map()) 
      val sqlContext = new SQLContext(sc)
      // this is used to implicitly convert an RDD to a DataFrame.
      val dfs = sqlContext.read.json("file:///SparkPractice/employee.json")
      //see the data in the DataFrame
      dfs.show()
   } 
} 