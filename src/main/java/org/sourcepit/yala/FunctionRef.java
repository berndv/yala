/*
 * Copyright 2015 Bernd Vogt and others.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sourcepit.yala;
public class FunctionRef {

   @FunctionalInterface
   interface FunctionRef_foo {
      String foo(Integer arg0, String arg1) throws Error;
   }

   FunctionRef_foo foo = (i, str) -> {
      return "";
   };

   @FunctionalInterface
   interface FunctionRef_doSth_callback {
      String foo(Integer arg0, String arg1) throws Error;
   }

   void doSth(FunctionRef_doSth_callback callback, int i) {
   }

   public static void main(String[] args) {
      FunctionRef ref = new FunctionRef();

      ref.doSth((arg0, arg1) -> {
         return "";
      }, 0);

      ref.foo = (arg0, arg1) -> {
         return "";
      };

      Bla bla = null;

      ref.foo = bla::hui;

      ref.doSth(bla::hui, 9);
   }

   @FunctionalInterface
   interface Bla {
      String hui(Integer arg0, String arg1) throws Error;
   }
}
