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


public class Functional<T, R>
   implements
      Functional_DoSth,
      Functional_DoSth1,
      Functional_DoSth2<T, R>,
      Functional_DoSth3
{

   protected class _Protected implements Functional_DoSth4
   {
      @Override
      public Object doSth(Byte b)
      {
         return Functional.this.doSth(b);
      }
   }

   class _Package implements Functional_DoSth5
   {
      @Override
      public Object doSth(Boolean b)
      {
         return Functional.this.doSth(b);
      }
   }

   private class _Private implements Functional_DoSth6
   {
      @Override
      public Object doSth(Long b)
      {
         return Functional.this.doSth(b);
      }
   }

   @Override
   public Integer doSth(Integer i)
   {
      return Integer.valueOf(0);
   }

   @Override
   public Object doSth(String srt, Integer i)
   {
      return null;
   }

   @Override
   public R doSth(T t)
   {
      return null;
   }

   @Override
   public Functional_DoSth3.Results doSth(String str)
   {
      final Functional_DoSth3.Results _results = new Functional_DoSth3.Results();
      _results.r1 = "";
      _results.r2 = Integer.valueOf(0);
      return _results;
   }

   protected Object doSth(Byte b)
   {
      return Byte.valueOf((byte) 0);
   }

   Object doSth(Boolean b)
   {
      return Boolean.valueOf(false);
   }

   private Object doSth(Long l)
   {
      return Long.valueOf(0);
   }
}
