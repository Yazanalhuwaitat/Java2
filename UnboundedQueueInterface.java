/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author user
 */
public interface UnboundedQueueInterface<T> extends QueueInterface<T>
{
  void enqueue(T element);

  // Adds element to the rear of this queue.
} 
